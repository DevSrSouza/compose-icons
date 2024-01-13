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

public val Octicons.SingleSelect16: ImageVector
    get() {
        if (_singleSelect16 != null) {
            return _singleSelect16!!
        }
        _singleSelect16 = Builder(name = "SingleSelect16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(5.06f, 7.356f)
                lineToRelative(2.795f, 2.833f)
                curveToRelative(0.08f, 0.081f, 0.21f, 0.081f, 0.29f, 0.0f)
                lineToRelative(2.794f, -2.833f)
                curveToRelative(0.13f, -0.131f, 0.038f, -0.356f, -0.145f, -0.356f)
                horizontalLineTo(5.206f)
                curveToRelative(-0.183f, 0.0f, -0.275f, 0.225f, -0.145f, 0.356f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 2.75f)
                curveTo(1.0f, 1.784f, 1.784f, 1.0f, 2.75f, 1.0f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(10.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 13.25f, 15.0f)
                lineTo(2.75f, 15.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 13.25f)
                close()
                moveTo(2.75f, 2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(10.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(13.5f, 2.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _singleSelect16!!
    }

private var _singleSelect16: ImageVector? = null
