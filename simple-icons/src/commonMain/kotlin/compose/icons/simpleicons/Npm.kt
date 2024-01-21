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

public val SimpleIcons.Npm: ImageVector
    get() {
        if (_npm != null) {
            return _npm!!
        }
        _npm = Builder(name = "Npm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.763f, 0.0f)
                curveTo(0.786f, 0.0f, 0.0f, 0.786f, 0.0f, 1.763f)
                verticalLineToRelative(20.474f)
                curveTo(0.0f, 23.214f, 0.786f, 24.0f, 1.763f, 24.0f)
                horizontalLineToRelative(20.474f)
                curveToRelative(0.977f, 0.0f, 1.763f, -0.786f, 1.763f, -1.763f)
                verticalLineTo(1.763f)
                curveTo(24.0f, 0.786f, 23.214f, 0.0f, 22.237f, 0.0f)
                close()
                moveTo(5.13f, 5.323f)
                lineToRelative(13.837f, 0.019f)
                lineToRelative(-0.009f, 13.836f)
                horizontalLineToRelative(-3.464f)
                lineToRelative(0.01f, -10.382f)
                horizontalLineToRelative(-3.456f)
                lineTo(12.04f, 19.17f)
                horizontalLineTo(5.113f)
                close()
            }
        }
        .build()
        return _npm!!
    }

private var _npm: ImageVector? = null
