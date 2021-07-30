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

public val OutlineGroup.Film: ImageVector
    get() {
        if (_film != null) {
            return _film!!
        }
        _film = Builder(name = "Film", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(18.26f, 3.0f)
                lineTo(5.74f, 3.0f)
                arcTo(2.74f, 2.74f, 0.0f, false, false, 3.0f, 5.74f)
                lineTo(3.0f, 18.26f)
                arcTo(2.74f, 2.74f, 0.0f, false, false, 5.74f, 21.0f)
                lineTo(18.26f, 21.0f)
                arcTo(2.74f, 2.74f, 0.0f, false, false, 21.0f, 18.26f)
                lineTo(21.0f, 5.74f)
                arcTo(2.74f, 2.74f, 0.0f, false, false, 18.26f, 3.0f)
                close()
                moveTo(7.0f, 11.0f)
                lineTo(5.0f, 11.0f)
                lineTo(5.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                close()
                moveTo(5.0f, 13.0f)
                lineTo(7.0f, 13.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 15.0f)
                close()
                moveTo(9.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                close()
                moveTo(19.0f, 11.0f)
                lineTo(17.0f, 11.0f)
                lineTo(17.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(17.0f, 15.0f)
                close()
                moveTo(19.0f, 5.74f)
                lineTo(19.0f, 7.0f)
                lineTo(17.0f, 7.0f)
                lineTo(17.0f, 5.0f)
                horizontalLineToRelative(1.26f)
                arcTo(0.74f, 0.74f, 0.0f, false, true, 19.0f, 5.74f)
                close()
                moveTo(5.74f, 5.0f)
                lineTo(7.0f, 5.0f)
                lineTo(7.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                lineTo(5.0f, 5.74f)
                arcTo(0.74f, 0.74f, 0.0f, false, true, 5.74f, 5.0f)
                close()
                moveTo(5.0f, 18.26f)
                lineTo(5.0f, 17.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.74f, 19.0f)
                arcTo(0.74f, 0.74f, 0.0f, false, true, 5.0f, 18.26f)
                close()
                moveTo(19.0f, 18.26f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -0.74f, 0.74f)
                lineTo(17.0f, 19.0f)
                lineTo(17.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _film!!
    }

private var _film: ImageVector? = null
