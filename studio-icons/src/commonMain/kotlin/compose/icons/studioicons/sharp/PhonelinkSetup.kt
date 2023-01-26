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

public val SharpGroup.PhonelinkSetup: ImageVector
    get() {
        if (_phonelinkSetup != null) {
            return _phonelinkSetup!!
        }
        _phonelinkSetup = Builder(name = "PhonelinkSetup", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(9.0f, 4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(16.0f)
                lineTo(9.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                lineTo(7.0f, 18.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(14.0f)
                lineTo(21.0f, 1.0f)
                close()
                moveTo(9.5f, 15.5f)
                curveToRelative(0.29f, -0.12f, 0.55f, -0.29f, 0.8f, -0.48f)
                lineToRelative(-0.02f, 0.03f)
                lineToRelative(1.41f, 0.55f)
                lineToRelative(1.27f, -2.2f)
                lineToRelative(-1.18f, -0.95f)
                lineToRelative(-0.02f, 0.03f)
                curveToRelative(0.02f, -0.16f, 0.05f, -0.32f, 0.05f, -0.48f)
                reflectiveCurveToRelative(-0.03f, -0.32f, -0.05f, -0.48f)
                lineToRelative(0.02f, 0.03f)
                lineToRelative(1.18f, -0.95f)
                lineToRelative(-1.26f, -2.2f)
                lineToRelative(-1.41f, 0.55f)
                lineToRelative(0.02f, 0.03f)
                curveToRelative(-0.26f, -0.19f, -0.52f, -0.36f, -0.81f, -0.48f)
                lineTo(9.27f, 7.0f)
                lineTo(6.73f, 7.0f)
                lineTo(6.5f, 8.5f)
                curveToRelative(-0.29f, 0.12f, -0.55f, 0.29f, -0.8f, 0.48f)
                lineToRelative(0.02f, -0.03f)
                lineTo(4.3f, 8.4f)
                lineToRelative(-1.27f, 2.2f)
                lineToRelative(1.18f, 0.95f)
                lineToRelative(0.02f, -0.03f)
                curveToRelative(-0.01f, 0.16f, -0.04f, 0.32f, -0.04f, 0.48f)
                reflectiveCurveToRelative(0.03f, 0.32f, 0.05f, 0.48f)
                lineToRelative(-0.02f, -0.03f)
                lineToRelative(-1.18f, 0.95f)
                lineToRelative(1.27f, 2.2f)
                lineToRelative(1.41f, -0.55f)
                lineToRelative(-0.02f, -0.03f)
                curveToRelative(0.25f, 0.19f, 0.51f, 0.36f, 0.8f, 0.48f)
                lineToRelative(0.23f, 1.5f)
                horizontalLineToRelative(2.54f)
                lineToRelative(0.23f, -1.5f)
                close()
                moveTo(6.0f, 12.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _phonelinkSetup!!
    }

private var _phonelinkSetup: ImageVector? = null
