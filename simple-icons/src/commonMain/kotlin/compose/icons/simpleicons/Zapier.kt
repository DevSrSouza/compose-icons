package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Zapier: ImageVector
    get() {
        if (_zapier != null) {
            return _zapier!!
        }
        _zapier = Builder(name = "Zapier", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.004f)
                curveToRelative(0.0f, 0.893f, -0.165f, 1.746f, -0.461f, 2.535f)
                curveToRelative(-0.787f, 0.297f, -1.643f, 0.461f, -2.535f, 0.461f)
                horizontalLineToRelative(-0.009f)
                curveToRelative(-0.893f, 0.0f, -1.745f, -0.165f, -2.534f, -0.461f)
                curveTo(9.164f, 13.75f, 9.0f, 12.896f, 9.0f, 12.004f)
                verticalLineToRelative(-0.009f)
                curveToRelative(0.0f, -0.893f, 0.164f, -1.745f, 0.461f, -2.534f)
                curveTo(10.25f, 9.164f, 11.103f, 9.0f, 11.995f, 9.0f)
                horizontalLineToRelative(0.009f)
                curveToRelative(0.893f, 0.0f, 1.748f, 0.164f, 2.535f, 0.462f)
                curveToRelative(0.297f, 0.788f, 0.461f, 1.641f, 0.461f, 2.535f)
                verticalLineToRelative(0.007f)
                close()
                moveTo(23.835f, 10.0f)
                horizontalLineTo(16.83f)
                lineToRelative(4.948f, -4.952f)
                curveToRelative(-0.39f, -0.548f, -0.82f, -1.06f, -1.295f, -1.533f)
                curveToRelative(-0.473f, -0.474f, -0.985f, -0.907f, -1.53f, -1.296f)
                lineToRelative(-4.954f, 4.949f)
                verticalLineTo(0.165f)
                curveTo(13.35f, 0.061f, 12.686f, 0.0f, 12.004f, 0.0f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.68f, 0.0f, -1.346f, 0.061f, -1.995f, 0.165f)
                verticalLineTo(7.17f)
                lineToRelative(-4.95f, -4.949f)
                curveToRelative(-0.549f, 0.386f, -1.06f, 0.821f, -1.534f, 1.294f)
                curveToRelative(-0.474f, 0.474f, -0.908f, 0.987f, -1.296f, 1.533f)
                lineTo(7.168f, 10.0f)
                horizontalLineTo(0.165f)
                reflectiveCurveTo(0.0f, 11.316f, 0.0f, 11.995f)
                verticalLineToRelative(0.009f)
                curveToRelative(0.0f, 0.68f, 0.061f, 1.348f, 0.165f, 1.995f)
                horizontalLineTo(7.17f)
                lineToRelative(-4.949f, 4.952f)
                curveToRelative(0.777f, 1.096f, 1.733f, 2.051f, 2.827f, 2.83f)
                lineTo(10.0f, 16.831f)
                verticalLineToRelative(7.004f)
                curveToRelative(0.648f, 0.105f, 1.313f, 0.165f, 1.991f, 0.165f)
                horizontalLineToRelative(0.017f)
                curveToRelative(0.679f, 0.0f, 1.344f, -0.06f, 1.991f, -0.165f)
                verticalLineToRelative(-7.004f)
                lineToRelative(4.952f, 4.95f)
                curveToRelative(0.548f, -0.375f, 1.06f, -0.812f, 1.529f, -1.29f)
                horizontalLineToRelative(0.005f)
                curveToRelative(0.473f, -0.465f, 0.906f, -0.976f, 1.296f, -1.531f)
                lineToRelative(-4.95f, -4.949f)
                horizontalLineToRelative(7.004f)
                curveToRelative(0.105f, -0.645f, 0.165f, -1.304f, 0.165f, -1.98f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, -0.678f, -0.06f, -1.343f, -0.165f, -1.99f)
            }
        }
        .build()
        return _zapier!!
    }

private var _zapier: ImageVector? = null
