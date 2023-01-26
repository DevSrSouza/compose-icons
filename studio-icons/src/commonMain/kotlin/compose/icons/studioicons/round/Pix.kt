package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Pix: ImageVector
    get() {
        if (_pix != null) {
            return _pix!!
        }
        _pix = Builder(name = "Pix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.45f, 16.52f)
                lineToRelative(-3.01f, -3.01f)
                curveToRelative(-0.11f, -0.11f, -0.24f, -0.13f, -0.31f, -0.13f)
                reflectiveCurveToRelative(-0.2f, 0.02f, -0.31f, 0.13f)
                lineTo(8.8f, 16.53f)
                curveToRelative(-0.34f, 0.34f, -0.87f, 0.89f, -2.64f, 0.89f)
                lineToRelative(3.71f, 3.7f)
                curveToRelative(1.17f, 1.17f, 3.07f, 1.17f, 4.24f, 0.0f)
                lineToRelative(3.72f, -3.71f)
                curveTo(16.92f, 17.41f, 16.16f, 17.23f, 15.45f, 16.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.8f, 7.47f)
                lineToRelative(3.02f, 3.02f)
                curveToRelative(0.08f, 0.08f, 0.2f, 0.13f, 0.31f, 0.13f)
                reflectiveCurveToRelative(0.23f, -0.05f, 0.31f, -0.13f)
                lineToRelative(2.99f, -2.99f)
                curveToRelative(0.71f, -0.74f, 1.52f, -0.91f, 2.43f, -0.91f)
                lineToRelative(-3.72f, -3.71f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0.0f)
                lineToRelative(-3.71f, 3.7f)
                curveTo(7.95f, 6.58f, 8.49f, 7.16f, 8.8f, 7.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.11f, 9.85f)
                lineToRelative(-2.25f, -2.26f)
                horizontalLineTo(17.6f)
                curveToRelative(-0.54f, 0.0f, -1.08f, 0.22f, -1.45f, 0.61f)
                lineToRelative(-3.0f, 3.0f)
                curveToRelative(-0.28f, 0.28f, -0.65f, 0.42f, -1.02f, 0.42f)
                curveToRelative(-0.36f, 0.0f, -0.74f, -0.15f, -1.02f, -0.42f)
                lineTo(8.09f, 8.17f)
                curveToRelative(-0.38f, -0.38f, -0.9f, -0.6f, -1.45f, -0.6f)
                horizontalLineTo(5.17f)
                lineToRelative(-2.29f, 2.3f)
                curveToRelative(-1.17f, 1.17f, -1.17f, 3.07f, 0.0f, 4.24f)
                lineToRelative(2.29f, 2.3f)
                horizontalLineToRelative(1.48f)
                curveToRelative(0.54f, 0.0f, 1.06f, -0.22f, 1.45f, -0.6f)
                lineToRelative(3.02f, -3.02f)
                curveToRelative(0.28f, -0.28f, 0.65f, -0.42f, 1.02f, -0.42f)
                curveToRelative(0.37f, 0.0f, 0.74f, 0.14f, 1.02f, 0.42f)
                lineToRelative(3.01f, 3.01f)
                curveToRelative(0.38f, 0.38f, 0.9f, 0.6f, 1.45f, 0.6f)
                horizontalLineToRelative(1.26f)
                lineToRelative(2.25f, -2.26f)
                curveTo(22.3f, 12.96f, 22.3f, 11.04f, 21.11f, 9.85f)
                close()
            }
        }
        .build()
        return _pix!!
    }

private var _pix: ImageVector? = null
