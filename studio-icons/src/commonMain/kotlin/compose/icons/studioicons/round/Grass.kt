package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Grass: ImageVector
    get() {
        if (_grass != null) {
            return _grass!!
        }
        _grass = Builder(name = "Grass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.64f, 11.02f)
                curveToRelative(0.55f, -1.47f, 1.43f, -2.78f, 2.56f, -3.83f)
                curveToRelative(0.38f, -0.36f, 0.04f, -1.0f, -0.46f, -0.85f)
                curveToRelative(-3.32f, 0.98f, -5.75f, 4.05f, -5.74f, 7.69f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveTo(12.95f, 12.75f, 14.2f, 11.72f, 15.64f, 11.02f)
                close()
                moveTo(11.42f, 8.85f)
                curveToRelative(-0.6f, -1.56f, -1.63f, -2.91f, -2.96f, -3.87f)
                curveTo(8.04f, 4.68f, 7.5f, 5.17f, 7.74f, 5.63f)
                curveTo(8.54f, 7.15f, 9.0f, 8.88f, 9.0f, 10.71f)
                curveToRelative(0.0f, 0.21f, -0.03f, 0.41f, -0.04f, 0.61f)
                curveToRelative(0.43f, 0.24f, 0.83f, 0.52f, 1.22f, 0.82f)
                curveTo(10.39f, 10.96f, 10.83f, 9.85f, 11.42f, 8.85f)
                close()
                moveTo(12.0f, 20.0f)
                horizontalLineTo(3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(4.75f)
                curveToRelative(-0.57f, -2.19f, -2.04f, -4.02f, -4.0f, -5.06f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.16f, -0.08f, -0.26f, -0.25f, -0.26f, -0.44f)
                curveToRelative(0.0f, -0.27f, 0.22f, -0.49f, 0.49f, -0.5f)
                curveToRelative(0.01f, 0.0f, 0.02f, 0.0f, 0.02f, 0.0f)
                curveTo(8.42f, 12.0f, 12.0f, 15.58f, 12.0f, 20.0f)
                close()
                moveTo(20.26f, 12.94f)
                lineTo(20.26f, 12.94f)
                curveToRelative(-1.96f, 1.04f, -3.44f, 2.87f, -4.0f, 5.06f)
                horizontalLineTo(21.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.68f, -0.07f, -1.35f, -0.2f, -2.0f)
                curveToRelative(-0.15f, -0.72f, -0.38f, -1.42f, -0.67f, -2.07f)
                curveTo(14.52f, 13.58f, 17.07f, 12.0f, 20.0f, 12.0f)
                curveToRelative(0.01f, 0.0f, 0.02f, 0.0f, 0.02f, 0.0f)
                curveToRelative(0.27f, 0.0f, 0.49f, 0.23f, 0.49f, 0.5f)
                curveTo(20.52f, 12.69f, 20.41f, 12.85f, 20.26f, 12.94f)
                close()
            }
        }
        .build()
        return _grass!!
    }

private var _grass: ImageVector? = null
