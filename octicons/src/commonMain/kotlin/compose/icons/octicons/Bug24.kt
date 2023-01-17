package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Bug24: ImageVector
    get() {
        if (_bug24 != null) {
            return _bug24!!
        }
        _bug24 = Builder(name = "Bug24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.72f, 0.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 0.0f)
                lineToRelative(1.204f, 1.203f)
                arcTo(4.98f, 4.98f, 0.0f, false, true, 12.0f, 1.0f)
                curveToRelative(0.717f, 0.0f, 1.4f, 0.151f, 2.016f, 0.423f)
                lineTo(15.22f, 0.22f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.042f, 0.018f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.018f, 1.042f)
                lineToRelative(-0.971f, 0.972f)
                arcTo(4.991f, 4.991f, 0.0f, false, true, 17.0f, 6.0f)
                verticalLineToRelative(1.104f)
                arcToRelative(2.755f, 2.755f, 0.0f, false, true, 1.917f, 1.974f)
                lineToRelative(1.998f, -0.999f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.67f, 1.342f)
                lineTo(19.0f, 10.714f)
                verticalLineTo(13.5f)
                lineToRelative(3.25f, 0.003f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(19.0f, 15.001f)
                verticalLineTo(16.0f)
                curveToRelative(0.0f, 0.568f, -0.068f, 1.134f, -0.204f, 1.686f)
                lineToRelative(0.04f, 0.018f)
                lineToRelative(2.75f, 1.375f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.671f, 1.342f)
                lineToRelative(-2.638f, -1.319f)
                arcTo(6.998f, 6.998f, 0.0f, false, true, 12.0f, 23.0f)
                arcToRelative(6.998f, 6.998f, 0.0f, false, true, -6.197f, -3.742f)
                lineToRelative(-2.758f, 1.181f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, -1.064f, -0.776f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, 0.474f, -0.602f)
                lineToRelative(2.795f, -1.199f)
                arcTo(6.976f, 6.976f, 0.0f, false, true, 5.0f, 16.0f)
                verticalLineToRelative(-0.996f)
                horizontalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-2.79f)
                lineTo(2.415f, 9.42f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.67f, -1.342f)
                lineToRelative(1.998f, 0.999f)
                arcTo(2.756f, 2.756f, 0.0f, false, true, 7.0f, 7.104f)
                verticalLineTo(6.0f)
                arcToRelative(4.99f, 4.99f, 0.0f, false, true, 1.69f, -3.748f)
                lineToRelative(-0.97f, -0.972f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.06f)
                close()
                moveTo(6.5f, 9.75f)
                verticalLineTo(16.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 11.0f, 0.0f)
                verticalLineTo(9.75f)
                curveToRelative(0.0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                horizontalLineToRelative(-8.5f)
                curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f)
                close()
                moveTo(8.5f, 7.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(6.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, -7.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bug24!!
    }

private var _bug24: ImageVector? = null
