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

public val MaterialDesignIcons.SubdirectoryArrowRight: ImageVector
    get() {
        if (_subdirectoryArrowRight != null) {
            return _subdirectoryArrowRight!!
        }
        _subdirectoryArrowRight = Builder(name = "SubdirectoryArrowRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                lineTo(13.0f, 21.0f)
                lineTo(11.58f, 19.58f)
                lineTo(15.17f, 16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.17f)
                lineTo(11.58f, 10.42f)
                lineTo(13.0f, 9.0f)
                lineTo(19.0f, 15.0f)
                close()
            }
        }
        .build()
        return _subdirectoryArrowRight!!
    }

private var _subdirectoryArrowRight: ImageVector? = null
