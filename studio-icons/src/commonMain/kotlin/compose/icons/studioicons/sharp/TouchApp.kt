package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.TouchApp: ImageVector
    get() {
        if (_touchApp != null) {
            return _touchApp!!
        }
        _touchApp = Builder(name = "TouchApp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.25f, 9.24f)
                verticalLineTo(5.5f)
                curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(3.74f)
                curveToRelative(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f)
                curveToRelative(0.0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.01f, -4.5f, 4.5f)
                curveTo(6.25f, 7.06f, 7.04f, 8.43f, 8.25f, 9.24f)
                close()
                moveTo(13.33f, 11.5f)
                horizontalLineToRelative(-1.08f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(10.74f)
                lineToRelative(-4.04f, -0.85f)
                lineTo(4.0f, 16.62f)
                lineTo(9.38f, 22.0f)
                horizontalLineToRelative(8.67f)
                lineToRelative(1.07f, -7.62f)
                lineTo(13.33f, 11.5f)
                close()
            }
        }
        .build()
        return _touchApp!!
    }

private var _touchApp: ImageVector? = null
