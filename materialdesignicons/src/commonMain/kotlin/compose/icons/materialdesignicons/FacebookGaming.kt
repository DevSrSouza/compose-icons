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

public val MaterialDesignIcons.FacebookGaming: ImageVector
    get() {
        if (_facebookGaming != null) {
            return _facebookGaming!!
        }
        _facebookGaming = Builder(name = "FacebookGaming", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 14.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(14.5f)
                horizontalLineTo(9.5f)
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                lineTo(21.0f, 8.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(15.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _facebookGaming!!
    }

private var _facebookGaming: ImageVector? = null
