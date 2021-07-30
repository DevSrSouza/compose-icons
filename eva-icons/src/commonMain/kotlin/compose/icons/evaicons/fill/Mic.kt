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

public val FillGroup.Mic: ImageVector
    get() {
        if (_mic != null) {
            return _mic!!
        }
        _mic = Builder(name = "Mic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                verticalLineTo(6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 6.0f)
                verticalLineToRelative(5.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 6.0f, 6.92f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.89f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, false, -0.89f, 0.89f)
                verticalLineToRelative(0.22f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, false, 0.89f, 0.89f)
                horizontalLineToRelative(6.22f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, false, 0.89f, -0.89f)
                verticalLineToRelative(-0.22f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, false, -0.89f, -0.89f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.92f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 19.0f, 11.0f)
                close()
            }
        }
        .build()
        return _mic!!
    }

private var _mic: ImageVector? = null
