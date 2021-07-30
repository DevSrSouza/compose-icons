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

public val OutlineGroup.DropletOff: ImageVector
    get() {
        if (_dropletOff != null) {
            return _dropletOff!!
        }
        _dropletOff = Builder(name = "DropletOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 19.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -3.88f, -1.64f)
                arcToRelative(5.73f, 5.73f, 0.0f, false, true, -0.69f, -7.11f)
                lineTo(6.0f, 8.82f)
                arcToRelative(7.74f, 7.74f, 0.0f, false, false, 0.7f, 9.94f)
                arcTo(7.37f, 7.37f, 0.0f, false, false, 12.0f, 21.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(7.36f, 7.36f, 0.0f, false, false, 4.58f, -1.59f)
                lineTo(15.15f, 18.0f)
                arcTo(5.43f, 5.43f, 0.0f, false, true, 12.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.43f)
                lineToRelative(3.88f, 4.0f)
                arcToRelative(5.71f, 5.71f, 0.0f, false, true, 1.49f, 5.15f)
                lineTo(19.0f, 16.15f)
                arcTo(7.72f, 7.72f, 0.0f, false, false, 17.31f, 8.0f)
                lineTo(12.71f, 3.3f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 3.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.72f, 0.3f)
                lineTo(8.73f, 5.9f)
                lineToRelative(1.42f, 1.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.71f, 19.29f)
                lineToRelative(-16.0f, -16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.29f, 4.71f)
                lineToRelative(16.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.71f, 19.29f)
                close()
            }
        }
        .build()
        return _dropletOff!!
    }

private var _dropletOff: ImageVector? = null
