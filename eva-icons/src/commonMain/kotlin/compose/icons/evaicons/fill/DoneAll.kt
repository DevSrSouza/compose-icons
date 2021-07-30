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

public val FillGroup.DoneAll: ImageVector
    get() {
        if (_doneAll != null) {
            return _doneAll!!
        }
        _doneAll = Builder(name = "DoneAll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(16.62f, 6.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 0.17f)
                lineToRelative(-7.0f, 9.0f)
                lineTo(4.78f, 11.2f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -1.56f, 1.25f)
                lineToRelative(4.17f, 5.18f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, 0.37f)
                horizontalLineToRelative(0.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 17.62f)
                lineToRelative(7.83f, -10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.62f, 6.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.62f, 6.21f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.41f, 0.17f)
                lineToRelative(-7.0f, 9.0f)
                lineToRelative(-0.61f, -0.75f)
                lineToRelative(-1.26f, 1.62f)
                lineToRelative(1.1f, 1.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, 0.37f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, -0.38f)
                lineToRelative(7.83f, -10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.62f, 6.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.71f, 13.06f)
                lineTo(10.0f, 11.44f)
                lineToRelative(-0.2f, -0.24f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.37f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.15f, 1.41f)
                close()
            }
        }
        .build()
        return _doneAll!!
    }

private var _doneAll: ImageVector? = null
