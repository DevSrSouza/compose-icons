package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Funnel: ImageVector
    get() {
        if (_funnel != null) {
            return _funnel!!
        }
        _funnel = Builder(name = "Funnel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.8f, 66.8f)
                lineTo(160.0f, 139.1f)
                verticalLineToRelative(56.6f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -7.1f, 13.3f)
                lineToRelative(-32.0f, 21.4f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -8.9f, 2.7f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, true, -7.5f, -1.9f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 96.0f, 217.1f)
                verticalLineToRelative(-78.0f)
                lineTo(30.2f, 66.8f)
                arcTo(16.1f, 16.1f, 0.0f, false, true, 42.1f, 40.0f)
                horizontalLineTo(213.9f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, 11.9f, 26.8f)
                close()
            }
        }
        .build()
        return _funnel!!
    }

private var _funnel: ImageVector? = null
