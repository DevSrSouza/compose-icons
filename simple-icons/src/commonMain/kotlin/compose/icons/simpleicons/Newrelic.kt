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

public val SimpleIcons.Newrelic: ImageVector
    get() {
        if (_newrelic != null) {
            return _newrelic!!
        }
        _newrelic = Builder(name = "Newrelic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0015f, 14.3091f)
                verticalLineToRelative(7.384f)
                lineTo(12.0008f, 24.0f)
                verticalLineTo(12.0008f)
                lineTo(1.6078f, 5.9996f)
                verticalLineToRelative(4.6167f)
                close()
                moveTo(12.0008f, 0.0f)
                lineTo(2.8232f, 5.2976f)
                lineTo(6.8209f, 7.606f)
                lineToRelative(5.1799f, -2.9893f)
                lineToRelative(6.3936f, 3.6913f)
                verticalLineToRelative(7.384f)
                lineToRelative(-5.1783f, 2.9908f)
                verticalLineToRelative(4.6167f)
                lineToRelative(9.176f, -5.2991f)
                verticalLineTo(5.9996f)
                close()
            }
        }
        .build()
        return _newrelic!!
    }

private var _newrelic: ImageVector? = null
