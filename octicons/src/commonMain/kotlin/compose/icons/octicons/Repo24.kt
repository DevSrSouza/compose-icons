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

public val Octicons.Repo24: ImageVector
    get() {
        if (_repo24 != null) {
            return _repo24!!
        }
        _repo24 = Builder(name = "Repo24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 5.75f, 0.0f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(20.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(5.25f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 18.0f)
                verticalLineToRelative(0.75f)
                curveToRelative(0.0f, 0.716f, 0.43f, 1.334f, 1.05f, 1.605f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.6f, 1.374f)
                arcTo(3.251f, 3.251f, 0.0f, false, true, 3.0f, 18.75f)
                close()
                moveTo(19.5f, 1.5f)
                horizontalLineTo(5.75f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineToRelative(12.651f)
                arcTo(2.989f, 2.989f, 0.0f, false, true, 6.0f, 15.0f)
                horizontalLineToRelative(13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 18.25f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(5.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(5.01f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.397f, 0.201f)
                lineToRelative(-2.206f, -1.604f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.294f, 0.0f)
                lineTo(7.397f, 23.46f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.397f, -0.2f)
                verticalLineToRelative(-5.01f)
                close()
            }
        }
        .build()
        return _repo24!!
    }

private var _repo24: ImageVector? = null
