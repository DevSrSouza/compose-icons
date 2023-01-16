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

public val MaterialDesignIcons.ExpandAllOutline: ImageVector
    get() {
        if (_expandAllOutline != null) {
            return _expandAllOutline!!
        }
        _expandAllOutline = Builder(name = "ExpandAllOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                moveTo(8.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                moveTo(20.0f, 12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 10.0f)
                horizontalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 12.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 22.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 20.0f)
                verticalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 10.0f)
                moveTo(19.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _expandAllOutline!!
    }

private var _expandAllOutline: ImageVector? = null
