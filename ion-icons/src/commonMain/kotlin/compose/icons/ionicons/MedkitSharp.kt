package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.MedkitSharp: ImageVector
    get() {
        if (_medkitSharp != null) {
            return _medkitSharp!!
        }
        _medkitSharp = Builder(name = "MedkitSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(484.0f, 96.0f)
                horizontalLineTo(384.0f)
                verticalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineTo(468.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(484.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(108.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 484.0f, 96.0f)
                close()
                moveTo(168.0f, 72.0f)
                horizontalLineTo(344.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(168.0f)
                close()
                moveTo(352.0f, 310.0f)
                horizontalLineTo(278.0f)
                verticalLineToRelative(74.0f)
                horizontalLineTo(234.0f)
                verticalLineTo(310.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(266.0f)
                horizontalLineToRelative(74.0f)
                verticalLineTo(192.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(74.0f)
                horizontalLineToRelative(74.0f)
                close()
            }
        }
        .build()
        return _medkitSharp!!
    }

private var _medkitSharp: ImageVector? = null
