package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.StackOverflow: VectorAsset
    get() {
        if (_stackOverflow != null) {
            return _stackOverflow!!
        }
        _stackOverflow = VectorAssetBuilder(name = "StackOverflow", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.986f, 21.865f)
                verticalLineToRelative(-6.404f)
                horizontalLineToRelative(2.134f)
                lineTo(21.12f, 24.0f)
                lineTo(1.844f, 24.0f)
                verticalLineToRelative(-8.539f)
                horizontalLineToRelative(2.13f)
                verticalLineToRelative(6.404f)
                horizontalLineToRelative(15.012f)
                close()
                moveTo(6.111f, 19.731f)
                lineTo(16.85f, 19.731f)
                verticalLineToRelative(-2.137f)
                lineTo(6.111f, 17.594f)
                verticalLineToRelative(2.137f)
                close()
                moveTo(6.37f, 14.879f)
                lineToRelative(10.48f, 2.189f)
                lineToRelative(0.451f, -2.07f)
                lineToRelative(-10.478f, -2.187f)
                lineToRelative(-0.453f, 2.068f)
                close()
                moveTo(7.729f, 9.823f)
                lineToRelative(9.705f, 4.53f)
                lineToRelative(0.903f, -1.95f)
                lineToRelative(-9.706f, -4.53f)
                lineToRelative(-0.902f, 1.936f)
                verticalLineToRelative(0.014f)
                close()
                moveTo(10.444f, 5.038f)
                lineToRelative(8.217f, 6.855f)
                lineToRelative(1.359f, -1.62f)
                lineToRelative(-8.216f, -6.853f)
                lineToRelative(-1.35f, 1.617f)
                lineToRelative(-0.01f, 0.001f)
                close()
                moveTo(15.751f, 0.0f)
                lineToRelative(-1.746f, 1.294f)
                lineToRelative(6.405f, 8.604f)
                lineToRelative(1.746f, -1.294f)
                lineTo(15.749f, 0.0f)
                horizontalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _stackOverflow!!
    }

private var _stackOverflow: VectorAsset? = null
