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

public val MaterialDesignIcons.AlphabetAurebesh: ImageVector
    get() {
        if (_alphabetAurebesh != null) {
            return _alphabetAurebesh!!
        }
        _alphabetAurebesh = Builder(name = "AlphabetAurebesh", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.23f)
                lineTo(22.0f, 4.0f)
                horizontalLineTo(19.0f)
                lineTo(13.46f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                moveTo(3.0f, 13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.46f)
                lineTo(19.0f, 20.0f)
                horizontalLineTo(22.0f)
                lineTo(14.23f, 13.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _alphabetAurebesh!!
    }

private var _alphabetAurebesh: ImageVector? = null
