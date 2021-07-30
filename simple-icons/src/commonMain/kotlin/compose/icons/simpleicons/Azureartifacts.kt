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

public val SimpleIcons.Azureartifacts: ImageVector
    get() {
        if (_azureartifacts != null) {
            return _azureartifacts!!
        }
        _azureartifacts = Builder(name = "Azureartifacts", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2f, 0.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, 0.43f, -1.0f, 0.958f)
                lineTo(4.2f, 11.5f)
                horizontalLineToRelative(15.6f)
                lineTo(19.8f, 0.958f)
                curveToRelative(0.0f, -0.529f, -0.448f, -0.958f, -1.0f, -0.958f)
                lineTo(5.2f, 0.0f)
                close()
                moveTo(8.4f, 2.3f)
                horizontalLineToRelative(2.4f)
                curveToRelative(0.331f, 0.0f, 0.6f, 0.257f, 0.6f, 0.575f)
                arcToRelative(0.588f, 0.588f, 0.0f, false, true, -0.6f, 0.575f)
                lineTo(8.4f, 3.45f)
                arcToRelative(0.588f, 0.588f, 0.0f, false, true, -0.6f, -0.575f)
                curveToRelative(0.0f, -0.318f, 0.269f, -0.575f, 0.6f, -0.575f)
                close()
                moveTo(1.064f, 12.0f)
                curveTo(0.476f, 12.0f, 0.0f, 12.448f, 0.0f, 13.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.552f, 0.476f, 1.0f, 1.064f, 1.0f)
                lineTo(8.8f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-3.0f)
                arcToRelative(0.6f, 0.6f, 0.0f, true, true, 0.0f, -1.201f)
                horizontalLineToRelative(3.0f)
                lineTo(7.8f, 12.0f)
                lineTo(1.064f, 12.0f)
                close()
                moveTo(23.0f, 12.0f)
                lineTo(8.299f, 12.0f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.552f, 0.477f, 1.0f, 1.064f, 1.0f)
                lineTo(23.0f, 24.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(24.0f, 13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(13.2f, 22.2f)
                lineTo(9.6f, 22.2f)
                lineTo(9.6f, 21.0f)
                horizontalLineToRelative(3.6f)
                verticalLineToRelative(1.2f)
                close()
                moveTo(15.6f, 20.4f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-1.2f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(1.2f)
                close()
                moveTo(15.0f, 15.0f)
                horizontalLineToRelative(-2.4f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.0f, -1.201f)
                lineTo(15.0f, 13.799f)
                arcTo(0.602f, 0.602f, 0.0f, false, true, 15.0f, 15.0f)
                close()
            }
        }
        .build()
        return _azureartifacts!!
    }

private var _azureartifacts: ImageVector? = null
