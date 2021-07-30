package compose.icons.evaicons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.FillGroup

public val FillGroup.Charging: ImageVector
    get() {
        if (_charging != null) {
            return _charging!!
        }
        _charging = Builder(name = "Charging", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.28f, 13.0f)
                horizontalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.86f, -0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.0f)
                lineTo(9.28f, 6.0f)
                horizontalLineTo(4.17f)
                arcTo(2.31f, 2.31f, 0.0f, false, false, 2.0f, 8.43f)
                verticalLineToRelative(7.14f)
                arcTo(2.31f, 2.31f, 0.0f, false, false, 4.17f, 18.0f)
                horizontalLineTo(8.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.83f, 6.0f)
                horizontalLineTo(11.58f)
                lineTo(8.72f, 11.0f)
                horizontalLineTo(13.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.86f, 0.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.0f)
                lineTo(10.72f, 18.0f)
                horizontalLineToRelative(5.11f)
                arcTo(2.31f, 2.31f, 0.0f, false, false, 18.0f, 15.57f)
                verticalLineTo(8.43f)
                arcTo(2.31f, 2.31f, 0.0f, false, false, 15.83f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 9.0f)
                close()
            }
        }
        .build()
        return _charging!!
    }

private var _charging: ImageVector? = null
