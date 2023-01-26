package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup._1xMobiledata: ImageVector
    get() {
        if (__1xMobiledata != null) {
            return __1xMobiledata!!
        }
        __1xMobiledata = Builder(name = "_1xMobiledata", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(15.83f, 11.72f)
                lineTo(18.66f, 7.0f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(-1.66f, 2.77f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(2.83f, 4.72f)
                lineTo(10.33f, 17.0f)
                horizontalLineToRelative(2.33f)
                lineToRelative(2.0f, -3.34f)
                lineToRelative(2.0f, 3.34f)
                horizontalLineTo(19.0f)
                lineTo(15.83f, 11.72f)
                close()
            }
        }
        .build()
        return __1xMobiledata!!
    }

private var __1xMobiledata: ImageVector? = null
