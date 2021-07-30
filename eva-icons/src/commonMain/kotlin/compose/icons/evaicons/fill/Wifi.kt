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

public val FillGroup.Wifi: ImageVector
    get() {
        if (_wifi != null) {
            return _wifi!!
        }
        _wifi = Builder(name = "Wifi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -3.47f, 1.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.39f, 1.44f)
                arcToRelative(3.08f, 3.08f, 0.0f, false, true, 4.16f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 1.39f, -1.44f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 12.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -6.47f, 2.75f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 13.14f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, 10.08f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.71f, 0.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.72f, -1.69f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.72f, 7.93f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.44f, 0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.66f, 9.37f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.68f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.69f, 0.28f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.72f, -0.31f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.72f, 7.93f)
                close()
            }
        }
        .build()
        return _wifi!!
    }

private var _wifi: ImageVector? = null
