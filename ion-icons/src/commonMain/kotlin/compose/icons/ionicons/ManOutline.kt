package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ManOutline: ImageVector
    get() {
        if (_manOutline != null) {
            return _manOutline!!
        }
        _manOutline = Builder(name = "ManOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 208.0f)
                verticalLineTo(472.0f)
                arcToRelative(23.73f, 23.73f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.73f, 23.73f, 0.0f, false, false, 24.0f, -24.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 336.0f)
                verticalLineTo(472.0f)
                arcToRelative(23.73f, 23.73f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.73f, 23.73f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(208.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 192.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(23.72f, 23.72f, 0.0f, false, true, -24.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.72f, 23.72f, 0.0f, false, true, -24.0f, -24.0f)
                verticalLineTo(192.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 48.0f, -48.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 48.0f, 48.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(23.72f, 23.72f, 0.0f, false, true, -24.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.72f, 23.72f, 0.0f, false, true, -24.0f, -24.0f)
                verticalLineTo(192.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 56.0f)
                moveToRelative(-40.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -80.0f, 0.0f)
            }
        }
        .build()
        return _manOutline!!
    }

private var _manOutline: ImageVector? = null
