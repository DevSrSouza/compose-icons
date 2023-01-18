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

public val IonIcons.WomanOutline: ImageVector
    get() {
        if (_womanOutline != null) {
            return _womanOutline!!
        }
        _womanOutline = Builder(name = "WomanOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 368.0f)
                verticalLineTo(472.0f)
                arcToRelative(23.73f, 23.73f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.73f, 23.73f, 0.0f, false, false, 24.0f, -24.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 368.0f)
                verticalLineTo(472.0f)
                arcToRelative(23.73f, 23.73f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.73f, 23.73f, 0.0f, false, false, 24.0f, -24.0f)
                verticalLineTo(368.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(183.0f, 274.0f)
                arcToRelative(23.73f, 23.73f, 0.0f, false, true, -29.84f, 16.18f)
                horizontalLineToRelative(0.0f)
                arcToRelative(23.72f, 23.72f, 0.0f, false, true, -16.17f, -29.84f)
                lineToRelative(25.0f, -84.28f)
                arcTo(44.85f, 44.85f, 0.0f, false, true, 205.0f, 144.0f)
                horizontalLineTo(307.0f)
                arcToRelative(44.85f, 44.85f, 0.0f, false, true, 43.0f, 32.08f)
                lineToRelative(25.0f, 84.28f)
                arcToRelative(23.72f, 23.72f, 0.0f, false, true, -16.17f, 29.84f)
                horizontalLineToRelative(0.0f)
                arcTo(23.73f, 23.73f, 0.0f, false, true, 329.05f, 274.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 56.0f)
                moveToRelative(-40.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 80.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -80.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 192.0f)
                lineToRelative(-48.0f, 160.0f)
                lineToRelative(192.0f, 0.0f)
                lineToRelative(-48.0f, -160.0f)
            }
        }
        .build()
        return _womanOutline!!
    }

private var _womanOutline: ImageVector? = null
