package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandHeadlessui: ImageVector
    get() {
        if (_brandHeadlessui != null) {
            return _brandHeadlessui!!
        }
        _brandHeadlessui = Builder(name = "BrandHeadlessui", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.744f, 4.325f)
                lineToRelative(7.82f, -1.267f)
                arcToRelative(4.456f, 4.456f, 0.0f, false, true, 5.111f, 3.686f)
                lineToRelative(1.267f, 7.82f)
                arcToRelative(4.456f, 4.456f, 0.0f, false, true, -3.686f, 5.111f)
                lineToRelative(-7.82f, 1.267f)
                arcToRelative(4.456f, 4.456f, 0.0f, false, true, -5.111f, -3.686f)
                lineToRelative(-1.267f, -7.82f)
                arcToRelative(4.456f, 4.456f, 0.0f, false, true, 3.686f, -5.111f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.252f, 7.704f)
                lineToRelative(7.897f, -1.28f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.147f, 0.828f)
                lineToRelative(0.36f, 2.223f)
                lineToRelative(-9.562f, 3.51f)
                lineToRelative(-0.67f, -4.134f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.828f, -1.147f)
                close()
            }
        }
        .build()
        return _brandHeadlessui!!
    }

private var _brandHeadlessui: ImageVector? = null
