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

public val OutlineGroup.Save: ImageVector
    get() {
        if (_save != null) {
            return _save!!
        }
        _save = Builder(name = "Save", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(20.12f, 8.71f)
                lineTo(15.29f, 3.88f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.17f, 3.0f)
                lineTo(6.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 3.0f, 6.0f)
                lineTo(3.0f, 18.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(18.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(21.0f, 10.83f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 20.12f, 8.71f)
                close()
                moveTo(10.0f, 19.0f)
                lineTo(10.0f, 17.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(19.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(16.0f, 19.0f)
                lineTo(16.0f, 16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(9.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                lineTo(6.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(5.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineTo(10.0f, 9.0f)
                lineTo(10.0f, 5.0f)
                horizontalLineToRelative(3.17f)
                arcToRelative(1.05f, 1.05f, 0.0f, false, true, 0.71f, 0.29f)
                lineToRelative(4.83f, 4.83f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.29f, 0.71f)
                close()
            }
        }
        .build()
        return _save!!
    }

private var _save: ImageVector? = null
