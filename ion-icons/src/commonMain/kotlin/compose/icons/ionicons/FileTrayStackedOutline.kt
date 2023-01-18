package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.FileTrayStackedOutline: ImageVector
    get() {
        if (_fileTrayStackedOutline != null) {
            return _fileTrayStackedOutline!!
        }
        _fileTrayStackedOutline = Builder(name = "FileTrayStackedOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 336.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, false, 48.0f, 48.0f)
                horizontalLineTo(416.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, false, 48.0f, -48.0f)
                verticalLineTo(336.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 336.0f)
                lineTo(192.0f, 336.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 336.0f)
                lineTo(464.0f, 336.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 336.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 128.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(384.0f, 32.0f)
                horizontalLineTo(128.0f)
                curveToRelative(-26.0f, 0.0f, -43.0f, 14.0f, -48.0f, 40.0f)
                lineTo(48.0f, 192.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, false, 48.0f, 48.0f)
                horizontalLineTo(416.0f)
                arcToRelative(48.14f, 48.14f, 0.0f, false, false, 48.0f, -48.0f)
                verticalLineTo(192.0f)
                lineTo(432.0f, 72.0f)
                curveTo(427.0f, 45.0f, 409.0f, 32.0f, 384.0f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 192.0f)
                lineTo(192.0f, 192.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 192.0f)
                lineTo(464.0f, 192.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 192.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 128.0f, 0.0f)
            }
        }
        .build()
        return _fileTrayStackedOutline!!
    }

private var _fileTrayStackedOutline: ImageVector? = null
