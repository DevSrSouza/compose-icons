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

public val FillGroup.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) {
            return _stackSimple!!
        }
        _stackSimple = Builder(name = "StackSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 104.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 4.0f, -6.9f)
                lineToRelative(112.0f, -64.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, 8.0f, 0.0f)
                lineToRelative(112.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 13.8f)
                lineToRelative(-112.0f, 64.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -8.0f, 0.0f)
                lineToRelative(-112.0f, -64.0f)
                arcTo(7.8f, 7.8f, 0.0f, false, true, 8.0f, 104.0f)
                close()
                moveTo(236.0f, 137.1f)
                lineTo(128.0f, 198.8f)
                lineTo(20.0f, 137.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 13.8f)
                lineToRelative(112.0f, 64.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 8.0f, 0.0f)
                lineToRelative(112.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -13.8f)
                close()
            }
        }
        .build()
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
