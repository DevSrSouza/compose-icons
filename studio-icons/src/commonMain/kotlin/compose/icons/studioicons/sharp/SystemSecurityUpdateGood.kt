package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SystemSecurityUpdateGood: ImageVector
    get() {
        if (_systemSecurityUpdateGood != null) {
            return _systemSecurityUpdateGood!!
        }
        _systemSecurityUpdateGood = Builder(name = "SystemSecurityUpdateGood", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 1.0f)
                verticalLineToRelative(22.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(17.0f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(10.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(16.0f, 10.05f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.54f, 3.54f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(11.05f, 15.0f)
                lineTo(16.0f, 10.05f)
                close()
            }
        }
        .build()
        return _systemSecurityUpdateGood!!
    }

private var _systemSecurityUpdateGood: ImageVector? = null
