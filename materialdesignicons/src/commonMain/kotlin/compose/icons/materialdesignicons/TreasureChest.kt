package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.TreasureChest: ImageVector
    get() {
        if (_treasureChest != null) {
            return _treasureChest!!
        }
        _treasureChest = Builder(name = "TreasureChest", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                horizontalLineTo(19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 4.0f)
                moveTo(11.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                moveTo(2.0f, 12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                lineTo(11.0f, 15.0f)
                horizontalLineTo(13.0f)
                lineTo(15.0f, 13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _treasureChest!!
    }

private var _treasureChest: ImageVector? = null
