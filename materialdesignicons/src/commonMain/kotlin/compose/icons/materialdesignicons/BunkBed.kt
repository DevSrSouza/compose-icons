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

public val MaterialDesignIcons.BunkBed: ImageVector
    get() {
        if (_bunkBed != null) {
            return _bunkBed!!
        }
        _bunkBed = Builder(name = "BunkBed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 2.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(7.0f)
                curveTo(23.0f, 4.79f, 21.21f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(2.0f)
                moveTo(6.5f, 2.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.5f, 7.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.0f, 4.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.5f, 2.0f)
                moveTo(3.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.56f)
                curveTo(20.41f, 13.21f, 19.73f, 13.0f, 19.0f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                moveTo(6.5f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 4.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.5f, 17.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.0f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 6.5f, 12.0f)
                close()
            }
        }
        .build()
        return _bunkBed!!
    }

private var _bunkBed: ImageVector? = null
