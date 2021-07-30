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

public val SimpleIcons.Trustpilot: ImageVector
    get() {
        if (_trustpilot != null) {
            return _trustpilot!!
        }
        _trustpilot = Builder(name = "Trustpilot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.227f, 16.67f)
                lineToRelative(2.19f, 6.742f)
                lineToRelative(-7.413f, -5.388f)
                lineToRelative(5.223f, -1.354f)
                close()
                moveTo(24.0f, 9.31f)
                horizontalLineToRelative(-9.165f)
                lineTo(12.005f, 0.589f)
                lineToRelative(-2.84f, 8.723f)
                lineTo(0.0f, 9.3f)
                lineToRelative(7.422f, 5.397f)
                lineToRelative(-2.84f, 8.714f)
                lineToRelative(7.422f, -5.388f)
                lineToRelative(4.583f, -3.326f)
                lineTo(24.0f, 9.311f)
                close()
            }
        }
        .build()
        return _trustpilot!!
    }

private var _trustpilot: ImageVector? = null
