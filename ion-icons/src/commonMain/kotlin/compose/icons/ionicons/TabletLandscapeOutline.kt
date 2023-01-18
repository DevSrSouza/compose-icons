package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.TabletLandscapeOutline: ImageVector
    get() {
        if (_tabletLandscapeOutline != null) {
            return _tabletLandscapeOutline!!
        }
        _tabletLandscapeOutline = Builder(name = "TabletLandscapeOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 384.0f)
                lineTo(16.0f, 128.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 64.0f, 80.0f)
                lineTo(448.0f, 80.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 496.0f, 128.0f)
                lineTo(496.0f, 384.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 448.0f, 432.0f)
                lineTo(64.0f, 432.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 16.0f, 384.0f)
                close()
            }
        }
        .build()
        return _tabletLandscapeOutline!!
    }

private var _tabletLandscapeOutline: ImageVector? = null
