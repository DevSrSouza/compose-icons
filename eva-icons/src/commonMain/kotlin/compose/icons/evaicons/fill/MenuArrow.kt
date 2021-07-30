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

public val FillGroup.MenuArrow: ImageVector
    get() {
        if (_menuArrow != null) {
            return _menuArrow!!
        }
        _menuArrow = Builder(name = "MenuArrow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.05f, 11.0f)
                horizontalLineTo(5.91f)
                lineToRelative(1.3f, -1.29f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.79f, 8.29f)
                lineToRelative(-3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.42f)
                lineToRelative(3.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                lineTo(5.91f, 13.0f)
                horizontalLineTo(20.05f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.95f, -0.95f)
                verticalLineTo(12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.05f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.95f, 17.0f)
                lineTo(20.05f, 17.0f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 21.0f, 17.95f)
                lineTo(21.0f, 18.05f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 20.05f, 19.0f)
                lineTo(3.95f, 19.0f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 3.0f, 18.05f)
                lineTo(3.0f, 17.95f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 3.95f, 17.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.95f, 5.0f)
                lineTo(20.05f, 5.0f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 21.0f, 5.95f)
                lineTo(21.0f, 6.05f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 20.05f, 7.0f)
                lineTo(3.95f, 7.0f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 3.0f, 6.05f)
                lineTo(3.0f, 5.95f)
                arcTo(0.95f, 0.95f, 0.0f, false, true, 3.95f, 5.0f)
                close()
            }
        }
        .build()
        return _menuArrow!!
    }

private var _menuArrow: ImageVector? = null
