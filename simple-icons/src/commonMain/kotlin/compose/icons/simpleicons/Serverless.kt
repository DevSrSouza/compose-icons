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

public val SimpleIcons.Serverless: ImageVector
    get() {
        if (_serverless != null) {
            return _serverless!!
        }
        _serverless = Builder(name = "Serverless", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 17.57f)
                horizontalLineToRelative(4.248f)
                lineToRelative(-1.316f, 3.974f)
                lineTo(0.0f, 21.544f)
                close()
                moveTo(0.0f, 10.013f)
                horizontalLineToRelative(6.75f)
                lineToRelative(-1.316f, 3.974f)
                lineTo(0.0f, 13.987f)
                close()
                moveTo(0.0f, 2.456f)
                horizontalLineToRelative(9.252f)
                lineTo(7.936f, 6.431f)
                lineTo(0.0f, 6.431f)
                close()
                moveTo(13.44f, 2.456f)
                lineTo(24.0f, 2.456f)
                verticalLineToRelative(3.975f)
                lineTo(12.123f, 6.431f)
                close()
                moveTo(9.62f, 13.987f)
                lineToRelative(1.317f, -3.974f)
                lineTo(24.0f, 10.013f)
                verticalLineToRelative(3.974f)
                close()
                moveTo(8.436f, 17.57f)
                lineTo(24.0f, 17.57f)
                verticalLineToRelative(3.975f)
                lineTo(7.119f, 21.545f)
                close()
            }
        }
        .build()
        return _serverless!!
    }

private var _serverless: ImageVector? = null
