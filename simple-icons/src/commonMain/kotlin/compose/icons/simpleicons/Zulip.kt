package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Zulip: VectorAsset
    get() {
        if (_zulip != null) {
            return _zulip!!
        }
        _zulip = VectorAssetBuilder(name = "Zulip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -24.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(15.97f, 6.0f)
                lineTo(7.02f, 6.0f)
                lineToRelative(1.0f, 2.03f)
                horizontalLineToRelative(6.06f)
                lineToRelative(-7.06f, 7.5f)
                lineToRelative(1.0f, 2.46f)
                horizontalLineToRelative(8.96f)
                lineToRelative(-1.0f, -2.02f)
                lineTo(9.91f, 15.97f)
                lineToRelative(7.06f, -7.5f)
                lineToRelative(-1.0f, -2.46f)
                close()
            }
        }
        .build()
        return _zulip!!
    }

private var _zulip: VectorAsset? = null
