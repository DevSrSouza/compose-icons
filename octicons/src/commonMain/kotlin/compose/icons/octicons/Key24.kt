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

public val Octicons.Key24: ImageVector
    get() {
        if (_key24 != null) {
            return _key24!!
        }
        _key24 = Builder(name = "Key24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.75f, 8.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, true, false, 0.0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 0.0f)
                arcToRelative(8.25f, 8.25f, 0.0f, true, true, -2.541f, 16.101f)
                lineToRelative(-1.636f, 1.636f)
                arcToRelative(1.744f, 1.744f, 0.0f, false, true, -1.237f, 0.513f)
                horizontalLineTo(9.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(1.448f)
                arcToRelative(0.876f, 0.876f, 0.0f, false, true, -0.256f, 0.619f)
                lineToRelative(-0.214f, 0.213f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.545f, 0.22f)
                horizontalLineTo(5.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(1.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 3.25f, 24.0f)
                horizontalLineToRelative(-1.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 22.25f)
                verticalLineToRelative(-2.836f)
                curveToRelative(0.0f, -0.464f, 0.185f, -0.908f, 0.513f, -1.236f)
                lineToRelative(7.386f, -7.388f)
                arcTo(8.249f, 8.249f, 0.0f, false, true, 15.75f, 0.0f)
                close()
                moveTo(9.0f, 8.25f)
                arcToRelative(6.733f, 6.733f, 0.0f, false, false, 0.463f, 2.462f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.168f, 0.804f)
                lineToRelative(-7.722f, 7.721f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.073f, 0.177f)
                verticalLineToRelative(2.836f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
                horizontalLineTo(7.5f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
                horizontalLineToRelative(1.086f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.177f, -0.073f)
                lineToRelative(1.971f, -1.972f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.804f, -0.168f)
                arcTo(6.75f, 6.75f, 0.0f, true, false, 9.0f, 8.25f)
                close()
            }
        }
        .build()
        return _key24!!
    }

private var _key24: ImageVector? = null
