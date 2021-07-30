package compose.icons.evaicons.outline

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
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.Facebook: ImageVector
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = Builder(name = "Facebook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineToRelative(-24.0f, -0.0f)
                lineToRelative(-0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineToRelative(-24.0f, -0.0f)
                lineToRelative(-0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(8.0f, 14.8f)
                lineTo(6.0f, 14.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(5.0f, 10.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(8.0f, 9.2f)
                lineTo(8.0f, 7.5f)
                arcTo(5.77f, 5.77f, 0.0f, false, true, 14.0f, 2.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                lineTo(18.0f, 6.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(14.0f, 7.6f)
                lineTo(14.0f, 9.2f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.8f, 0.39f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.16f, 0.88f)
                lineToRelative(-1.0f, 3.6f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 0.73f)
                lineTo(14.0f, 14.8f)
                lineTo(14.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 22.0f)
                close()
                moveTo(10.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                lineTo(12.0f, 13.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(2.24f)
                lineToRelative(0.44f, -1.6f)
                lineTo(13.0f, 11.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(12.0f, 7.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -1.9f)
                horizontalLineToRelative(2.0f)
                lineTo(16.0f, 4.0f)
                lineTo(14.0f, 4.0f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, false, -4.0f, 3.5f)
                verticalLineToRelative(2.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(7.0f, 11.2f)
                verticalLineToRelative(1.6f)
                lineTo(9.0f, 12.8f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null
