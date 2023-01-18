package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.HardwareChipSharp: ImageVector
    get() {
        if (_hardwareChipSharp != null) {
            return _hardwareChipSharp!!
        }
        _hardwareChipSharp = Builder(name = "HardwareChipSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 160.0f)
                horizontalLineToRelative(192.0f)
                verticalLineToRelative(192.0f)
                horizontalLineToRelative(-192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 198.0f)
                verticalLineTo(154.0f)
                horizontalLineTo(448.0f)
                verticalLineTo(88.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, -24.0f)
                horizontalLineTo(358.0f)
                verticalLineTo(32.0f)
                horizontalLineTo(314.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(278.0f)
                verticalLineTo(32.0f)
                horizontalLineTo(234.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(198.0f)
                verticalLineTo(32.0f)
                horizontalLineTo(154.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(88.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 64.0f, 88.0f)
                verticalLineToRelative(66.0f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(44.0f)
                horizontalLineTo(64.0f)
                verticalLineToRelative(36.0f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(44.0f)
                horizontalLineTo(64.0f)
                verticalLineToRelative(36.0f)
                horizontalLineTo(32.0f)
                verticalLineToRelative(44.0f)
                horizontalLineTo(64.0f)
                verticalLineToRelative(66.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(66.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(44.0f)
                verticalLineTo(448.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(44.0f)
                verticalLineTo(448.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(44.0f)
                verticalLineTo(448.0f)
                horizontalLineToRelative(66.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(358.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(314.0f)
                horizontalLineTo(448.0f)
                verticalLineTo(278.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(234.0f)
                horizontalLineTo(448.0f)
                verticalLineTo(198.0f)
                close()
                moveTo(128.0f, 128.0f)
                horizontalLineTo(384.0f)
                verticalLineTo(384.0f)
                horizontalLineTo(128.0f)
                close()
            }
        }
        .build()
        return _hardwareChipSharp!!
    }

private var _hardwareChipSharp: ImageVector? = null
