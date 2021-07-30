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

public val OutlineGroup.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(19.0f, 7.0f)
                lineTo(16.0f, 7.0f)
                lineTo(16.0f, 5.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.5f, 3.0f)
                horizontalLineToRelative(-3.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.0f, 5.5f)
                lineTo(8.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, 3.0f)
                lineTo(19.0f, 21.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 3.0f, -3.0f)
                lineTo(22.0f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 7.0f)
                close()
                moveTo(15.0f, 9.0f)
                lineTo(15.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                lineTo(9.0f, 9.0f)
                close()
                moveTo(10.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(14.0f, 7.0f)
                lineTo(10.0f, 7.0f)
                close()
                moveTo(4.0f, 18.0f)
                lineTo(4.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 9.0f)
                lineTo(7.0f, 9.0f)
                lineTo(7.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 18.0f)
                close()
                moveTo(20.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(17.0f, 19.0f)
                lineTo(17.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
