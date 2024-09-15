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

public val SimpleIcons.BlockchainDotCom: ImageVector
    get() {
        if (_blockchainDotCom != null) {
            return _blockchainDotCom!!
        }
        _blockchainDotCom = Builder(name = "BlockchainDotCom", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.829f, 6.612f)
                lineToRelative(-5.52f, -5.535f)
                arcToRelative(3.135f, 3.135f, 0.0f, false, false, -4.5f, 0.0f)
                lineToRelative(-5.535f, 5.535f)
                lineToRelative(7.755f, 3.87f)
                close()
                moveTo(21.947f, 8.847f)
                lineToRelative(1.095f, 1.095f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, true, 0.0f, 4.5f)
                lineTo(14.22f, 23.35f)
                arcToRelative(2.685f, 2.685f, 0.0f, false, true, -0.72f, 0.525f)
                lineTo(13.5f, 13.077f)
                close()
                moveTo(2.054f, 8.847f)
                lineToRelative(-1.095f, 1.095f)
                arcToRelative(3.12f, 3.12f, 0.0f, false, false, 0.0f, 4.5f)
                lineTo(9.78f, 23.35f)
                curveToRelative(0.209f, 0.214f, 0.452f, 0.391f, 0.72f, 0.525f)
                lineTo(10.5f, 13.077f)
                close()
            }
        }
        .build()
        return _blockchainDotCom!!
    }

private var _blockchainDotCom: ImageVector? = null
