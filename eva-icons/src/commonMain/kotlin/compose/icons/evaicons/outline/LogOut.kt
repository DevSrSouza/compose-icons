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

public val OutlineGroup.LogOut: ImageVector
    get() {
        if (_logOut != null) {
            return _logOut!!
        }
        _logOut = Builder(name = "LogOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                lineToRelative(-0.0f, 24.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(-0.0f, -24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 4.0f)
                horizontalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 5.0f)
                verticalLineTo(19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineTo(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.82f, 11.42f)
                lineTo(18.0f, 7.42f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.39f, -0.24f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.24f, 1.4f)
                lineTo(18.09f, 11.0f)
                lineTo(18.0f, 11.0f)
                horizontalLineTo(10.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                lineToRelative(-1.8f, 2.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.2f, 1.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.6f, 0.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.8f, -0.4f)
                lineToRelative(3.0f, -4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.82f, 11.42f)
                close()
            }
        }
        .build()
        return _logOut!!
    }

private var _logOut: ImageVector? = null
