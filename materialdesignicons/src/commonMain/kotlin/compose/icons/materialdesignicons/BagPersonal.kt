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

public val MaterialDesignIcons.BagPersonal: ImageVector
    get() {
        if (_bagPersonal != null) {
            return _bagPersonal!!
        }
        _bagPersonal = Builder(name = "BagPersonal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 2.0f)
                horizontalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 4.0f)
                verticalLineTo(5.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 4.0f, 9.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 20.0f)
                verticalLineTo(9.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 5.0f)
                moveTo(10.0f, 4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                moveTo(12.0f, 9.0f)
                lineTo(14.0f, 11.0f)
                lineTo(12.0f, 13.0f)
                lineTo(10.0f, 11.0f)
                lineTo(12.0f, 9.0f)
                moveTo(18.0f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _bagPersonal!!
    }

private var _bagPersonal: ImageVector? = null
