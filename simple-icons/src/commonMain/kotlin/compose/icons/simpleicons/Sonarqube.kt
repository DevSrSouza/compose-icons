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

public val SimpleIcons.Sonarqube: ImageVector
    get() {
        if (_sonarqube != null) {
            return _sonarqube!!
        }
        _sonarqube = Builder(name = "Sonarqube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.685f, 0.386f)
                lineToRelative(-0.465f, 0.766f)
                curveToRelative(3.477f, 2.112f, 6.305f, 5.27f, 7.966f, 8.89f)
                lineTo(24.0f, 9.67f)
                curveTo(22.266f, 5.887f, 19.313f, 2.59f, 15.685f, 0.386f)
                close()
                moveTo(8.462f, 0.91f)
                lineToRelative(-0.305f, 1.075f)
                curveToRelative(6.89f, 1.976f, 12.384f, 7.64f, 13.997f, 14.421f)
                lineToRelative(1.085f, -0.258f)
                curveTo(21.535f, 8.977f, 15.735f, 2.997f, 8.462f, 0.909f)
                close()
                moveTo(0.0f, 2.667f)
                verticalLineToRelative(1.342f)
                curveToRelative(10.963f, 0.0f, 19.883f, 8.795f, 19.883f, 19.605f)
                horizontalLineToRelative(1.342f)
                curveToRelative(0.0f, -11.55f, -9.522f, -20.947f, -21.225f, -20.947f)
                close()
            }
        }
        .build()
        return _sonarqube!!
    }

private var _sonarqube: ImageVector? = null
