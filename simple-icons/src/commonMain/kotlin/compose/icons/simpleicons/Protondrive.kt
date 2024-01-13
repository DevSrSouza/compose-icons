package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Protondrive: ImageVector
    get() {
        if (_protondrive != null) {
            return _protondrive!!
        }
        _protondrive = Builder(name = "Protondrive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 6.595f)
                verticalLineToRelative(12.79f)
                curveToRelative(0.0f, 1.36f, -1.11f, 2.462f, -2.482f, 2.462f)
                horizontalLineToRelative(-1.62f)
                verticalLineTo(9.0f)
                arcToRelative(2.925f, 2.925f, 0.0f, false, false, -2.93f, -2.914f)
                lineToRelative(-9.42f, 0.053f)
                arcToRelative(0.943f, 0.943f, 0.0f, false, true, -0.55f, -0.172f)
                lineTo(4.905f, 4.493f)
                arcToRelative(2.918f, 2.918f, 0.0f, false, false, -1.694f, -0.536f)
                horizontalLineTo(0.1f)
                arcTo(2.47f, 2.47f, 0.0f, false, true, 2.482f, 2.15f)
                horizontalLineToRelative(4.657f)
                curveToRelative(0.47f, 0.0f, 0.928f, 0.148f, 1.305f, 0.424f)
                lineToRelative(1.559f, 1.134f)
                curveToRelative(0.38f, 0.276f, 0.837f, 0.424f, 1.308f, 0.424f)
                horizontalLineToRelative(10.207f)
                arcTo(2.471f, 2.471f, 0.0f, false, true, 24.0f, 6.595f)
                close()
                moveTo(18.897f, 9.0f)
                verticalLineToRelative(12.85f)
                horizontalLineTo(2.482f)
                arcTo(2.471f, 2.471f, 0.0f, false, true, 0.0f, 19.387f)
                verticalLineTo(4.957f)
                horizontalLineToRelative(3.21f)
                curveToRelative(0.4f, 0.0f, 0.792f, 0.122f, 1.118f, 0.353f)
                lineToRelative(2.095f, 1.476f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, 1.13f, 0.353f)
                lineToRelative(9.402f, -0.052f)
                arcTo(1.922f, 1.922f, 0.0f, false, true, 18.897f, 9.0f)
                close()
            }
        }
        .build()
        return _protondrive!!
    }

private var _protondrive: ImageVector? = null
