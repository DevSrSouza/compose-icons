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

public val IonIcons.HardwareChip: ImageVector
    get() {
        if (_hardwareChip != null) {
            return _hardwareChip!!
        }
        _hardwareChip = Builder(name = "HardwareChip", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 160.0f)
                lineTo(344.0f, 160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 352.0f, 168.0f)
                lineTo(352.0f, 344.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 344.0f, 352.0f)
                lineTo(168.0f, 352.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 344.0f)
                lineTo(160.0f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 160.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                horizontalLineTo(448.0f)
                verticalLineTo(128.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, -64.0f, -64.0f)
                horizontalLineTo(352.0f)
                verticalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(272.0f)
                verticalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(192.0f)
                verticalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(128.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, -64.0f, 64.0f)
                verticalLineToRelative(32.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineTo(64.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineTo(64.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 32.0f)
                horizontalLineTo(64.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 32.0f, 0.0f)
                verticalLineTo(448.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 32.0f, 0.0f)
                verticalLineTo(448.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 32.0f, 0.0f)
                verticalLineTo(448.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f)
                verticalLineTo(352.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                horizontalLineTo(448.0f)
                verticalLineTo(272.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                horizontalLineTo(448.0f)
                verticalLineTo(192.0f)
                close()
                moveTo(384.0f, 352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                horizontalLineTo(160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                verticalLineTo(160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineTo(352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _hardwareChip!!
    }

private var _hardwareChip: ImageVector? = null
