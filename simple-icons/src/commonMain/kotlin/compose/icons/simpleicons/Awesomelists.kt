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

public val SimpleIcons.Awesomelists: ImageVector
    get() {
        if (_awesomelists != null) {
            return _awesomelists!!
        }
        _awesomelists = Builder(name = "Awesomelists", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 11.438f)
                lineToRelative(-6.154f, -5.645f)
                lineToRelative(-0.865f, 0.944f)
                lineToRelative(5.128f, 4.7f)
                horizontalLineTo(1.895f)
                lineToRelative(5.128f, -4.705f)
                lineToRelative(-0.865f, -0.943f)
                lineToRelative(-6.154f, 5.649f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.72f)
                curveToRelative(0.0f, 1.683f, 1.62f, 3.053f, 3.61f, 3.053f)
                horizontalLineToRelative(3.795f)
                curveToRelative(1.99f, 0.0f, 3.61f, -1.37f, 3.61f, -3.051f)
                verticalLineToRelative(-2.446f)
                horizontalLineToRelative(1.97f)
                verticalLineToRelative(2.446f)
                curveToRelative(0.0f, 1.68f, 1.62f, 3.051f, 3.61f, 3.051f)
                horizontalLineToRelative(3.794f)
                curveToRelative(1.99f, 0.0f, 3.61f, -1.37f, 3.61f, -3.051f)
                verticalLineToRelative(-3.721f)
                close()
            }
        }
        .build()
        return _awesomelists!!
    }

private var _awesomelists: ImageVector? = null
