package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                    pathFillType = EvenOdd) {
                moveTo(15.75f, 0.0f)
                arcToRelative(8.25f, 8.25f, 0.0f, false, false, -7.851f, 10.79f)
                lineTo(0.513f, 18.178f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 0.0f, 19.414f)
                verticalLineToRelative(2.836f)
                curveTo(0.0f, 23.217f, 0.784f, 24.0f, 1.75f, 24.0f)
                horizontalLineToRelative(1.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 5.0f, 22.25f)
                verticalLineToRelative(-1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(2.735f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.545f, -0.22f)
                lineToRelative(0.214f, -0.213f)
                arcTo(0.875f, 0.875f, 0.0f, false, false, 9.0f, 19.948f)
                verticalLineTo(18.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(1.086f)
                curveToRelative(0.464f, 0.0f, 0.91f, -0.184f, 1.237f, -0.513f)
                lineToRelative(1.636f, -1.636f)
                arcTo(8.25f, 8.25f, 0.0f, true, false, 15.75f, 0.0f)
                close()
                moveTo(9.0f, 8.25f)
                arcToRelative(6.75f, 6.75f, 0.0f, true, true, 4.288f, 6.287f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.804f, 0.168f)
                lineToRelative(-1.971f, 1.972f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.177f, 0.073f)
                horizontalLineTo(9.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 7.5f, 18.5f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(5.25f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.75f, 1.75f)
                verticalLineToRelative(1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-2.836f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.073f, -0.177f)
                lineToRelative(7.722f, -7.721f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.168f, -0.804f)
                arcTo(6.73f, 6.73f, 0.0f, false, true, 9.0f, 8.25f)
                close()
            }
        }
        .build()
        return _key24!!
    }

private var _key24: ImageVector? = null
