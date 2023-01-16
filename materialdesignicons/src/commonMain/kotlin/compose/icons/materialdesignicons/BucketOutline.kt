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

public val MaterialDesignIcons.BucketOutline: ImageVector
    get() {
        if (_bucketOutline != null) {
            return _bucketOutline!!
        }
        _bucketOutline = Builder(name = "BucketOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                lineTo(17.5f, 21.0f)
                horizontalLineTo(6.5f)
                lineTo(4.0f, 7.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                moveTo(17.97f, 7.0f)
                horizontalLineTo(6.03f)
                lineTo(8.15f, 19.0f)
                horizontalLineTo(15.85f)
                lineTo(17.97f, 7.0f)
                close()
            }
        }
        .build()
        return _bucketOutline!!
    }

private var _bucketOutline: ImageVector? = null
