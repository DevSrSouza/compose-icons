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

public val RoundGroup.InsertLink: ImageVector
    get() {
        if (_insertLink != null) {
            return _insertLink!!
        }
        _insertLink = Builder(name = "InsertLink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.96f, 11.38f)
                curveTo(4.24f, 9.91f, 5.62f, 8.9f, 7.12f, 8.9f)
                horizontalLineToRelative(2.93f)
                curveToRelative(0.52f, 0.0f, 0.95f, -0.43f, 0.95f, -0.95f)
                reflectiveCurveTo(10.57f, 7.0f, 10.05f, 7.0f)
                lineTo(7.22f, 7.0f)
                curveToRelative(-2.61f, 0.0f, -4.94f, 1.91f, -5.19f, 4.51f)
                curveTo(1.74f, 14.49f, 4.08f, 17.0f, 7.0f, 17.0f)
                horizontalLineToRelative(3.05f)
                curveToRelative(0.52f, 0.0f, 0.95f, -0.43f, 0.95f, -0.95f)
                reflectiveCurveToRelative(-0.43f, -0.95f, -0.95f, -0.95f)
                lineTo(7.0f, 15.1f)
                curveToRelative(-1.91f, 0.0f, -3.42f, -1.74f, -3.04f, -3.72f)
                close()
                moveTo(9.0f, 13.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(9.0f, 11.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                close()
                moveTo(16.78f, 7.0f)
                horizontalLineToRelative(-2.83f)
                curveToRelative(-0.52f, 0.0f, -0.95f, 0.43f, -0.95f, 0.95f)
                reflectiveCurveToRelative(0.43f, 0.95f, 0.95f, 0.95f)
                horizontalLineToRelative(2.93f)
                curveToRelative(1.5f, 0.0f, 2.88f, 1.01f, 3.16f, 2.48f)
                curveToRelative(0.38f, 1.98f, -1.13f, 3.72f, -3.04f, 3.72f)
                horizontalLineToRelative(-3.05f)
                curveToRelative(-0.52f, 0.0f, -0.95f, 0.43f, -0.95f, 0.95f)
                reflectiveCurveToRelative(0.43f, 0.95f, 0.95f, 0.95f)
                lineTo(17.0f, 17.0f)
                curveToRelative(2.92f, 0.0f, 5.26f, -2.51f, 4.98f, -5.49f)
                curveToRelative(-0.25f, -2.6f, -2.59f, -4.51f, -5.2f, -4.51f)
                close()
            }
        }
        .build()
        return _insertLink!!
    }

private var _insertLink: ImageVector? = null
