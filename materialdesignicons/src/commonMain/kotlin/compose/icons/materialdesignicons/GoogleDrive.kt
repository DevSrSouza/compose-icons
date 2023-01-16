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

public val MaterialDesignIcons.GoogleDrive: ImageVector
    get() {
        if (_googleDrive != null) {
            return _googleDrive!!
        }
        _googleDrive = Builder(name = "GoogleDrive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.71f, 3.5f)
                lineTo(1.15f, 15.0f)
                lineTo(4.58f, 21.0f)
                lineTo(11.13f, 9.5f)
                moveTo(9.73f, 15.0f)
                lineTo(6.3f, 21.0f)
                horizontalLineTo(19.42f)
                lineTo(22.85f, 15.0f)
                moveTo(22.28f, 14.0f)
                lineTo(15.42f, 2.0f)
                horizontalLineTo(8.58f)
                lineTo(8.57f, 2.0f)
                lineTo(15.43f, 14.0f)
                horizontalLineTo(22.28f)
                close()
            }
        }
        .build()
        return _googleDrive!!
    }

private var _googleDrive: ImageVector? = null
