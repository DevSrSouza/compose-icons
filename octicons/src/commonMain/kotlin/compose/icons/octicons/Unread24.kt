package compose.icons.octicons

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
import compose.icons.Octicons

public val Octicons.Unread24: ImageVector
    get() {
        if (_unread24 != null) {
            return _unread24!!
        }
        _unread24 = Builder(name = "Unread24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.75f, 4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(0.852f)
                lineToRelative(10.36f, 7.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.28f, 0.0f)
                lineToRelative(5.69f, -3.845f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 18.67f, 10.0f)
                lineToRelative(-5.69f, 3.845f)
                curveToRelative(-0.592f, 0.4f, -1.368f, 0.4f, -1.96f, 0.0f)
                lineTo(1.5f, 7.412f)
                verticalLineTo(19.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(20.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-8.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.5f, 0.0f)
                verticalLineToRelative(8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 22.25f, 21.0f)
                horizontalLineTo(1.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 19.25f)
                verticalLineTo(4.75f)
                curveTo(0.0f, 3.784f, 0.784f, 3.0f, 1.75f, 3.0f)
                horizontalLineToRelative(15.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(1.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 5.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 5.0f, 0.0f)
                close()
            }
        }
        .build()
        return _unread24!!
    }

private var _unread24: ImageVector? = null
