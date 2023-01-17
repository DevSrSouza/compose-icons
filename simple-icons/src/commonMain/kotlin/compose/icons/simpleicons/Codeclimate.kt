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

public val SimpleIcons.Codeclimate: ImageVector
    get() {
        if (_codeclimate != null) {
            return _codeclimate!!
        }
        _codeclimate = Builder(name = "Codeclimate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.125f, 5.272f)
                lineToRelative(-4.511f, 4.475f)
                lineToRelative(2.684f, 2.659f)
                lineToRelative(1.827f, -1.813f)
                lineToRelative(5.19f, 5.145f)
                lineTo(24.0f, 13.079f)
                close()
                moveTo(8.13f, 8.265f)
                lineTo(0.0f, 16.066f)
                lineToRelative(2.772f, 2.662f)
                lineToRelative(5.357f, -5.145f)
                lineToRelative(5.357f, 5.145f)
                lineToRelative(2.772f, -2.662f)
                close()
            }
        }
        .build()
        return _codeclimate!!
    }

private var _codeclimate: ImageVector? = null
